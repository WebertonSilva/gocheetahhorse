import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';


import { CallcenterModule } from './main/callcenter/callcenter.module';
import { CorretorModule } from './main/corretor/corretor.module';
import { SeguradoBModule } from './main/segurado-b/segurado-b.module';

import { AppComponent } from './app.component';
import { HeaderComponent } from './shared/header/header.component';
import { FooterComponent } from './shared/footer/footer.component';
import { MenuComponent } from './main/menu/menu.component';
import { MainComponent } from './main/main.component';
import { MenuSeguradoComponent } from './main/menu-segurado/menu-segurado.component';

import {rotas } from './app.routing';

import { UserService } from './services/user.service';
import { SetCiaService } from './services/setCia.service';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MenuComponent,
    MainComponent,
    MenuSeguradoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    RouterModule.forRoot(rotas),
    CallcenterModule,
    CorretorModule,
    SeguradoBModule
  ],
  providers: [
    UserService,
    SetCiaService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
