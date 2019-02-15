import { TestBed } from '@angular/core/testing';

import { VoegBiebToeFormService } from './voeg-bieb-toe-form.service';

describe('VoegBiebToeFormService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VoegBiebToeFormService = TestBed.get(VoegBiebToeFormService);
    expect(service).toBeTruthy();
  });
});
