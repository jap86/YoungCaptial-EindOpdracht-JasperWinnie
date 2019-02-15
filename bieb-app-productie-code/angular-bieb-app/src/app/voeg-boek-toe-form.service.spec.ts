import { TestBed } from '@angular/core/testing';

import { VoegBoekToeFormService } from './voeg-boek-toe-form.service';

describe('VoegBoekToeFormService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VoegBoekToeFormService = TestBed.get(VoegBoekToeFormService);
    expect(service).toBeTruthy();
  });
});
