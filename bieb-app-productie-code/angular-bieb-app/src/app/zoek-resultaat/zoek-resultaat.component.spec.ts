import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ZoekResultaatComponent } from './zoek-resultaat.component';

describe('ZoekResultaatComponent', () => {
  let component: ZoekResultaatComponent;
  let fixture: ComponentFixture<ZoekResultaatComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ZoekResultaatComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ZoekResultaatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
