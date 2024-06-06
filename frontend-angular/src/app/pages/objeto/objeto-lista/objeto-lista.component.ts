import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Objeto } from '../../../models/objeto'; // Asegúrate de que esta ruta sea correcta
import { ObjetoService } from '../../../services/objeto.service'; // Asegúrate de que esta ruta sea correcta

@Component({
  selector: 'app-objeto-lista',
  templateUrl: './objeto-lista.component.html',
  styleUrls: ['./objeto-lista.component.css']
})
export class ObjetoListaComponent implements OnInit {
  objetos: Objeto[] = [];
  filtros: any = {
    nombre: '',
    descripcion: '',
    precio: '',
    fechaCreacion: ''
  };

  constructor(private objetoService: ObjetoService, private router: Router) { }

  ngOnInit(): void {
    this.cargarObjetos();
  }

  cargarObjetos(): void {
    this.objetoService.getObjetos().subscribe(
      data => this.objetos = data,
      error => console.error('Error al cargar objetos', error)
    );
  }

  buscarObjetos(): void {
    this.objetoService.findByFilters(this.filtros).subscribe(
      data => this.objetos = data,
      error => console.error('Error al buscar objetos', error)
    );
  }

  editarObjeto(id: number): void {
    this.router.navigate(['editar-objeto', id]);
  }

  eliminarObjeto(id: number): void {
    this.objetoService.deleteObjeto(id).subscribe(
      () => this.cargarObjetos(),
      error => console.error('Error al eliminar objeto', error)
    );
  }
}
