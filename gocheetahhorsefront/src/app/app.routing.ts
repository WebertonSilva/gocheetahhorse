import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CallcenterComponent } from './main/callcenter/callcenter.component';
import { CorretorComponent } from './main/corretor/corretor.component';
import { MenuSeguradoComponent } from './main/menu-segurado/menu-segurado.component';
import { SeguradoBComponent } from './main/segurado-b/segurado-b.component';
import { MenuComponent } from './main/menu/menu.component';
import { MainComponent } from './main/main.component';

export const rotas: Routes = [
    { path: '', redirectTo: '/menu', pathMatch: 'full' },
    { path: 'menu', component: MenuComponent },
    { path: 'callcenter', component: CallcenterComponent },
    { path: 'corretor', component: CorretorComponent },
    { path: 'menu-segurado', component: MenuSeguradoComponent },
    { path: 'segurado-b', component: SeguradoBComponent },
]