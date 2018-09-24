import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-table-music',
  templateUrl: './table-music.component.html',
  styleUrls: ['./table-music.component.css']
})
export class TableMusicComponent implements OnInit {

  @Input()
  private multiple;
  @Input()
  public musicas;

  constructor() { }

  ngOnInit() {
  }

  public isMultiple() {
    return this.multiple;
  }

}
