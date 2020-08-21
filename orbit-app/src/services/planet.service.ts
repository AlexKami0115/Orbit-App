import { Injectable } from '@angular/core';
import { Planet } from 'src/app/planet';
import { map } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlanetService {

  private appUrl = '/api';

  public planet: Planet;

  constructor(public http: HttpClient) {
  }



  // GET request to the backend api, for a random planet. 
  getPlanet(): Observable<Planet>{
    return this.http.get(this.appUrl + '/randomPlanet')
      .pipe(
        map(resp => {
          return resp as Planet;
      })
    );
  }
}
