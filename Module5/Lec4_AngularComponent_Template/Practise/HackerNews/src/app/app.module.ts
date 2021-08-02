import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewsComponent } from './news/news.component';
import { LikesComponent } from './likes/likes.component';
import { NavabarComponent } from './navabar/navabar.component';

@NgModule({
  declarations: [
    AppComponent,
    NewsComponent,
    LikesComponent,
    NavabarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
