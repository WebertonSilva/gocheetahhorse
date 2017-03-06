import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';

import { MainComponent } from './main.component';
import { CallcenterComponent } from './callcenter/callcenter.component';
import { CorretorComponent } from './corretor/corretor.component';
import { SeguradoBComponent } from './segurado-b/segurado-b.component';
import { MenuSeguradoComponent } from './menu-segurado/menu-segurado.component';

@NgModule({
  imports: [
    CommonModule,
    ReactiveFormsModule
  ],
  declarations: [
    MainComponent,
    CallcenterComponent,
    CorretorComponent,
    SeguradoBComponent,
    MenuSeguradoComponent
  ]
})
export class MainModule { }
