import { Component } from '@angular/core';
import {NgForm} from '@angular/forms';
import { MusicaService } from './services/musica.service';
import { PlaylistService } from './services/playlist.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


  constructor(private musicaService: MusicaService, private playlistService: PlaylistService) {

  }

  public getMusicas() {
    return this.musicaService.musicas;
  }

  buscarMusicas(f: NgForm) {
    if (f.valid) {
      this.musicaService.filtrarMusicas(f.value.nome)
        .subscribe((response: Array<any>) => {
          if (response == null) {
            alert('Nenhum resultado encontrado');
          }
          this.musicaService.musicas = response;

        }, error => {
          if (error.status === 400) {
            alert('Quantidade de caracteres menor que o limite mínimo');
          } else if (error.status === 500) {
            alert('Busca inválida, por favor, tente de outra maneira');
          }
        });
    }
  }

  buscarUsuarios(f: NgForm) {
    if (f.valid) {
      this.playlistService.filtarPlaylist(f.value.usuario)
        .subscribe((response: Array<any>) => {
          if (response == null) {
            alert('Nenhum resultado encontrado');
          }
          this.musicaService.musicas = response;

        }, error => {
          if (error.status === 400) {
            alert('Quantidade de caracteres menor que o limite mínimo');
          } else if (error.status === 500) {
            alert('Busca inválida, por favor, tente de outra maneira');
          }
        });
    }
  }
}
