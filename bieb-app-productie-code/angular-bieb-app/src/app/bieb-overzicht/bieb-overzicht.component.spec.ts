import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BiebOverzichtComponent } from './bieb-overzicht.component';

describe('BiebOverzichtComponent', () => {
  let component: BiebOverzichtComponent;
  let fixture: ComponentFixture<BiebOverzichtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BiebOverzichtComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BiebOverzichtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
