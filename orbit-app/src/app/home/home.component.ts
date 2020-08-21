import { Component, Input } from '@angular/core';
import { Planet } from '../planet';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  // binded to planet of parent component, sidebar. 
  @Input() planet: Planet;
  
  constructor() { }
}
