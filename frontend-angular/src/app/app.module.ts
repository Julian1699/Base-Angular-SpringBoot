import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { BienvenidaComponent } from './pages/bienvenida/bienvenida.component';
import { InformacionComponent } from './pages/informacion/informacion.component';
import { TecnologiasComponent } from './pages/tecnologias/tecnologias.component';
import { ObjetoListaComponent } from './pages/objeto/objeto-lista/objeto-lista.component';
import { AgregarObjetoComponent } from './pages/objeto/agregar-objeto/agregar-objeto.component';
import { EditarObjetoComponent } from './pages/objeto/editar-objeto/editar-objeto.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BienvenidaComponent,
    InformacionComponent,
    TecnologiasComponent,
    ObjetoListaComponent,
    AgregarObjetoComponent,
    EditarObjetoComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
