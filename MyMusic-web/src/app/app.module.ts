import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { TableMusicComponent } from './table-music/table-music.component';
import { MusicaService } from './services/musica.service';
import { PlaylistService } from './services/playlist.service';


@NgModule({
  declarations: [
    AppComponent,
    TableMusicComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [MusicaService, PlaylistService],
  bootstrap: [AppComponent]
})
export class AppModule { }
