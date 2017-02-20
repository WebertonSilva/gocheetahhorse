import { Component, OnInit } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';

import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-corretor',
  templateUrl: './corretor.component.html',
  styleUrls: ['./corretor.component.scss']
})
export class CorretorComponent implements OnInit {

  
  credentials = {name: 'Alfredo Luis', cpf: 53313447635};

  isAuth;
  
 constructor(private _service: UserService) {}

  ngOnInit() {
    this._service.addUser('http://10.213.124.22:3000/post', this.credentials).subscribe(users => this.isAuth = users.IsAuth);
  } 
}
