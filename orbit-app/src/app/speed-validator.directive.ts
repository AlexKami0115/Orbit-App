import { Directive } from '@angular/core';
import { Validator, AbstractControl, NG_VALIDATORS, ValidationErrors } from '@angular/forms';

@Directive({
  selector: '[speedInvalid]',
  providers: [{
    provide: NG_VALIDATORS,
    useExisting: SpeedValidatorDirective,
    multi: true
  }]
})

export class SpeedValidatorDirective implements Validator {

  // validates entry for speed adjustment.
  validate(control: AbstractControl): {[key: string]: any} | null {
    if(control.value >= 200 || control.value < 0){
      return {'speedInvalid':true};
    } else { return null }
  }

  constructor() { }

}
