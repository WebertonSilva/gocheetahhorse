import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CallcenterComponent } from './main/callcenter/callcenter.component';
import { CorretorComponent } from './main/corretor/corretor.component';
import { SeguradoAComponent } from './main/segurado-a/segurado-a.component';
import { SeguradoBComponent } from './main/segurado-b/segurado-b.component';
import { MenuComponent } from './main/menu/menu.component';
import { MainComponent } from './main/main.component';

export const rotas: Routes = [
    { path: '', redirectTo: '/main/menu', pathMatch: 'full' },
    {
        path: 'main', component: MainComponent,
        children: [
            { path: 'menu', component: MenuComponent },
            { path: 'callcenter', component: CallcenterComponent },
            { path: 'corretor', component: CorretorComponent },
            { path: 'segurado-a', component: SeguradoAComponent },
            { path: 'segurado-b', component: SeguradoBComponent },
        ]
    }
]