import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';


import { CallcenterModule } from './main/callcenter/callcenter.module';
import { CorretorModule } from './main/corretor/corretor.module';
import { SeguradoAModule } from './main/segurado-a/segurado-a.module';
import { SeguradoBModule } from './main/segurado-b/segurado-b.module';

import { AppComponent } from './app.component';
import { HeaderComponent } from './shared/header/header.component';
import { FooterComponent } from './shared/footer/footer.component';
import { MenuComponent } from './main/menu/menu.component';
import { MainComponent } from './main/main.component';

import {rotas } from './app.routing';

import { UserService } from './services/user.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MenuComponent,
    MainComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(rotas),
    CallcenterModule,
    CorretorModule,
    SeguradoAModule,
    SeguradoBModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
