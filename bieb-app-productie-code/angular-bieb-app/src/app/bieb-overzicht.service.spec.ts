import { TestBed } from '@angular/core/testing';

import { BiebOverzichtService } from './bieb-overzicht.service';

describe('BiebOverzichtService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BiebOverzichtService = TestBed.get(BiebOverzichtService);
    expect(service).toBeTruthy();
  });
});
