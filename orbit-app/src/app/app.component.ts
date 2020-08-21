import { Component, OnInit } from '@angular/core';

declare let $:any;

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'orbit-app';

  ngOnInit(){
    // Using jQuery to toggle the sidebar
    $('#sidebarCollapse').on('click', function () {
      $('#sidebar').toggleClass('active');
    });
  }
}
