import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoegBiebToeFormComponent } from './voeg-bieb-toe-form.component';

describe('VoegBiebToeFormComponent', () => {
  let component: VoegBiebToeFormComponent;
  let fixture: ComponentFixture<VoegBiebToeFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoegBiebToeFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoegBiebToeFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
