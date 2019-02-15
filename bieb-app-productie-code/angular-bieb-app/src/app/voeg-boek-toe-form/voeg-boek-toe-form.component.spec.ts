import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoegBoekToeFormComponent } from './voeg-boek-toe-form.component';

describe('VoegBoekToeFormComponent', () => {
  let component: VoegBoekToeFormComponent;
  let fixture: ComponentFixture<VoegBoekToeFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoegBoekToeFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoegBoekToeFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
