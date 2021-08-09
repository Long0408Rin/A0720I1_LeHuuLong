import { TestBed, inject } from '@angular/core/testing';

import { ActivatedRouterService } from './activated-router.service';

describe('ActivatedRouterService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ActivatedRouterService]
    });
  });

  it('should be created', inject([ActivatedRouterService], (service: ActivatedRouterService) => {
    expect(service).toBeTruthy();
  }));
});
