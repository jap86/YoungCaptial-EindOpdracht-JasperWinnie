import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BoekOverzichtComponent } from './boek-overzicht.component';

describe('BoekOverzichtComponent', () => {
  let component: BoekOverzichtComponent;
  let fixture: ComponentFixture<BoekOverzichtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BoekOverzichtComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BoekOverzichtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
