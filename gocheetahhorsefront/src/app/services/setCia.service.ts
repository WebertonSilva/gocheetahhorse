import { Injectable } from '@angular/core';
import {BehaviorSubject} from 'rxjs/BehaviorSubject';

@Injectable()
export class SetCiaService {

  private _cia = new BehaviorSubject<number>(0);

  cia$ = this._cia.asObservable();
  
  changeCia(number) {
    this._cia.next(number);
  }
   
}