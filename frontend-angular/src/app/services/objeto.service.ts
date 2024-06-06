import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Objeto } from '../models/objeto';

@Injectable({
  providedIn: 'root'
})
export class ObjetoService {
  private apiUrl = 'http://localhost:8080/api/v1/objeto';  // URL de la API

  constructor(private http: HttpClient) { }

  getObjetos(): Observable<Objeto[]> {
    return this.http.get<Objeto[]>(this.apiUrl);
  }

  getObjeto(id: number): Observable<Objeto> {
    const url = `${this.apiUrl}/${id}`;
    return this.http.get<Objeto>(url);
  }

  findByFilters(filtros: any): Observable<Objeto[]> {
    let params = new HttpParams();
    if (filtros.nombre) params = params.set('nombre', filtros.nombre);
    if (filtros.descripcion) params = params.set('descripcion', filtros.descripcion);
    if (filtros.precio) params = params.set('precio', filtros.precio);
    if (filtros.fechaCreacion) params = params.set('fechaCreacion', filtros.fechaCreacion);

    return this.http.get<Objeto[]>(`${this.apiUrl}/buscar`, { params });
  }

  addObjeto(objeto: Objeto): Observable<Objeto> {
    return this.http.post<Objeto>(this.apiUrl, objeto);
  }

  updateObjeto(id: number, objeto: Objeto): Observable<any> {
    const url = `${this.apiUrl}/${id}`;
    return this.http.put(url, objeto);
  }

  deleteObjeto(id: number): Observable<any> {
    const url = `${this.apiUrl}/${id}`;
    return this.http.delete(url);
  }
}
