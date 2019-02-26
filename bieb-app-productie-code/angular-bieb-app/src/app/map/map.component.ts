import { Component, OnInit } from '@angular/core';
import {MapService} from "../map.service";

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {
  lat: string = '';
  lng: string = '';

  location: object;

  constructor(private map: MapService) { }

  ngOnInit() {
    this.map.getLocatie().subscribe(data => {
      console.log(data);
      this.lat = data.latitude;
      this.lng = data.longitude;
    })
  }

}
