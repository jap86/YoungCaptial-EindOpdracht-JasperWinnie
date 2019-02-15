import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BiebComponent } from './bieb.component';

describe('BiebComponent', () => {
  let component: BiebComponent;
  let fixture: ComponentFixture<BiebComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BiebComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BiebComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
