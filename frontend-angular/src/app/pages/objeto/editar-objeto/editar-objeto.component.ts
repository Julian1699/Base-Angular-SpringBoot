import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Objeto } from '../../../models/objeto'; // Asegúrate de que esta ruta sea correcta
import { ObjetoService } from '../../../services/objeto.service'; // Asegúrate de que esta ruta sea correcta

@Component({
  selector: 'app-editar-objeto',
  templateUrl: './editar-objeto.component.html',
  styleUrls: ['./editar-objeto.component.css']
})
export class EditarObjetoComponent implements OnInit {
  id: number;
  objeto: Objeto = new Objeto();

  constructor(private objetoService: ObjetoService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.cargarObjeto();
  }

  cargarObjeto(): void {
    this.objetoService.getObjeto(this.id).subscribe(
      {
        next: (datos: Objeto) => this.objeto = datos,
        error: (errores) => console.log(errores)
      }
    );
  }

  onInputChange(event: Event): void {
    const target = event.target as HTMLInputElement;
    const name = target.name;
    const value = target.value;

    (this.objeto as any)[name] = value;
  }

  onSubmit(): void {
    this.objetoService.updateObjeto(this.id, this.objeto).subscribe(
      {
        next: () => this.router.navigate(['/objetos']),
        error: (errores) => console.log(errores)
      }
    );
  }
}
