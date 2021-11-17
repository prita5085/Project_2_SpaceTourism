import { TestBed } from '@angular/core/testing';

import { SpaceportService } from './spaceport.service';

describe('SpaceportService', () => {
  let service: SpaceportService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SpaceportService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
