import { TestBed } from '@angular/core/testing';

import { BoekOverzichtService } from './boek-overzicht.service';

describe('BoekOverzichtService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BoekOverzichtService = TestBed.get(BoekOverzichtService);
    expect(service).toBeTruthy();
  });
});
