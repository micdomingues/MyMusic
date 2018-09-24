import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Injectable()
export class PlaylistService {
  private pathUrlPlaylist = environment.pathUrlPlaylist;

  public musicas: Array<any>;

  constructor(private httpClient: HttpClient) { }

  filtarPlaylist(term: string) {
    return this.httpClient.get(`${this.pathUrlPlaylist}/api/playlists?user=` + term);
  }

}
