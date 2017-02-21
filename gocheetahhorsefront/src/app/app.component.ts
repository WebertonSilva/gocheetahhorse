import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  seguradora: string;

  setSeguguradora( event ) {
      console.log(event);
      this.seguradora = event;
    }
}
