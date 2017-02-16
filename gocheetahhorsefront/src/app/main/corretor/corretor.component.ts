import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-corretor',
  templateUrl: './corretor.component.html',
  styleUrls: ['./corretor.component.scss']
})
export class CorretorComponent implements OnInit {

  tokenCorretor: string;

  constructor() { }

  ngOnInit() {
  }

}
