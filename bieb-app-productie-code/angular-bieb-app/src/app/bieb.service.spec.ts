import { TestBed } from '@angular/core/testing';

import { BiebService } from './bieb.service';

describe('BiebService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BiebService = TestBed.get(BiebService);
    expect(service).toBeTruthy();
  });
});
