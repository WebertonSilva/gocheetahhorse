import { Component, OnInit, Input } from '@angular/core';
import { SetCiaService }   from './../../services/setCia.service';
import {Subscription} from 'rxjs/Subscription';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  value;
  seguradora;
  subscription:Subscription;

  constructor(private _setCiaService:SetCiaService) {}

  ngOnInit() {
    this.subscription = this._setCiaService.cia$
       .subscribe(item => {
         this.value = item;
         localStorage.setItem('seguradora', this.value);
         this.seguradora = localStorage.getItem('seguradora');
        })

  }

  ngOnDestroy() {
    // prevent memory leak when component is destroyed
    this.subscription.unsubscribe();
  }


}
