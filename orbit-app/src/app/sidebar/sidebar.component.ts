import { Component, OnInit } from '@angular/core';
import { Planet } from '../planet';
import { PlanetService } from 'src/services/planet.service';
import { faAlignLeft } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  // injected into child component "home"
  planet: Planet;

  // changed using the sidebar input.
  orbit_speed: number;
  spin_speed: number;

  // true = started, false = paused
  public motion: boolean = true;

  // used to save planet state
  public planetState: Planet;

  // icon
  faAlignLeft = faAlignLeft;

  constructor(public pService: PlanetService) { }

  ngOnInit(): void {
    this.planet = new Planet();
    this.getRandomPlanet();
  }

  setSpinSpeed(): void{
    this.planet.spinSpeed = this.spin_speed/10;
  }

  setOrbitSpeed(): void{
    if(!this.motion) {
      this.motion = true; this.planet.state = 'running';
    } 
    this.planet.orbitSpeed = this.orbit_speed/10;
  }

  // start/stop orbit
  toggleMotion() {
    this.motion = !this.motion;
    this.checkState(this.planetState);
  }

  // motion = true, change the object. if false, change appearence. set state according to motion. 
  checkState(planet: Planet) {
    if(!this.motion) {
      this.planet.filePath = planet.filePath;
      this.planet.name = planet.name;
      this.planet.radius = planet.radius;
    } else {
      this.planet = planet;
    }

    this.planet.state = (this.motion ? 'running' : 'paused');
  }

  getRandomPlanet(): void {
    this.pService.getPlanet().subscribe(resp => 
      {this.planetState = resp;
       this.checkState(this.planetState);
      }
      );
  }
}

/******************************************************************************************************
*                                                                                                     *
* Below functionality not ready yet, saving this block for future use.                                *
*                                                                                                     *
* Progress was made for a transition speed effect between the current object in orbit and the newly   *
* generated one, however it is still buggy.                                                           *
* Goal is for the current planet to speed up or slow down to match the new planets speed.             *
*                                                                                                     *
*******************************************************************************************************/
  // speedUp(s1: number, s2: number){
  //   console.log('in speedUp', s1, s2);
  //   this.planet.orbitSpeed += (s1 - s2);

  //   while(s1 > s2){
  //     console.log('in while loop');
  //     setTimeout(() => { this.planet.orbitSpeed++;}, 1000);
  //     s2++;
  //   }
  //   this.planet.state = (this.motion ? 'running' : 'paused');
  // }

  // slowDown(s1: number, s2: number){
  //   console.log('in slowDown', s1, s2);

  //   while(s1 < s2){
  //     console.log('in while loop');
  //     setTimeout(() => { this.planet.orbitSpeed--;}, 1000);
  //     s1++;
  //   }
  //   this.planet.state = (this.motion ? 'running' : 'paused');
  // }

  // async transitionSpeed(p1: Planet, p2: Planet){
  //   console.log('transition speed called');
  //   do {
  //     p1.orbitSpeed++;
  //     await delay(10000000000000000);
  //     console.log(p1.orbitSpeed);
  //   } while(p1.orbitSpeed<p2.orbitSpeed)
  // }

  // delay(ms: number){
  //   return new Promise( resolve => setTimeout(resolve, ms));
  // }  
