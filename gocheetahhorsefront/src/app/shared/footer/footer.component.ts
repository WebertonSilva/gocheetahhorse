import { Component, OnInit } from '@angular/core';
import { SetCiaService }   from './../../services/setCia.service';
import {Subscription} from 'rxjs/Subscription';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss']
})
export class FooterComponent implements OnInit {

  seguradora;
  subscription:Subscription;

  constructor(private _setCiaService:SetCiaService) {}

  ngOnInit() {
    this.subscription = this._setCiaService.cia$
       .subscribe(item => {this.seguradora = item})
  }

  ngOnDestroy() {
    // prevent memory leak when component is destroyed
    this.subscription.unsubscribe();
  }
}
