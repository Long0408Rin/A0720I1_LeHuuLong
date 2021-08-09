import { PreloadAllModules, RouterModule, Routes } from '../../node_modules/@angular/router';
import {NgModule} from '@angular/core';
import { TimelivesComponent } from './timelives/timelives.component';


const routes: Routes = [
  {
    path: 'timelines',
    component: TimelivesComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})
export class AppRoutingModule {}
