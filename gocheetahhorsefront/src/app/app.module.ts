import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';

import { MainModule } from './main/main.module';

import { AppComponent } from './app.component';
import { HeaderComponent } from './shared/header/header.component';
import { FooterComponent } from './shared/footer/footer.component';
import { MenuComponent } from './main/menu/menu.component';

import {rotas } from './app.routing';

import { UserService } from './services/user.service';
import { SetCiaService } from './services/setCia.service';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    RouterModule.forRoot(rotas),
    MainModule
  ],
  providers: [
    UserService,
    SetCiaService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
