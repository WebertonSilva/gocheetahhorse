import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './shared/header/header.component';
import { FooterComponent } from './shared/footer/footer.component';

import { CorretorComponent } from './main/corretor/corretor.component';
import { CallcenterComponent } from './main/callcenter/callcenter.component';
import { SeguradoAComponent } from './main/segurado-a/segurado-a.component';
import { SeguradoBComponent } from './main/segurado-b/segurado-b.component';
import { MenuComponent } from './main/menu/menu.component';
import { MainComponent } from './main/main.component';
import {rotas } from './app.routing';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CorretorComponent,
    CallcenterComponent,
    SeguradoAComponent,
    SeguradoBComponent,
    MenuComponent,
    MainComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(rotas),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
