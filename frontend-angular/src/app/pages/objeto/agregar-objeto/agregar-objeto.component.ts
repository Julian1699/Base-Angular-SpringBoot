import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Objeto } from '../../../models/objeto'; // Asegúrate de que esta ruta sea correcta
import { ObjetoService } from '../../../services/objeto.service'; // Asegúrate de que esta ruta sea correcta

@Component({
  selector: 'app-agregar-objeto',
  templateUrl: './agregar-objeto.component.html',
  styleUrls: ['./agregar-objeto.component.css']
})
export class AgregarObjetoComponent implements OnInit {
  objeto: Objeto = new Objeto();

  constructor(private objetoService: ObjetoService, private router: Router) { }

  ngOnInit(): void { }

  onSubmit(): void {
    this.objetoService.addObjeto(this.objeto).subscribe(
      () => this.router.navigate(['/objetos']),
      error => console.error('Error al agregar objeto', error)
    );
  }
}
