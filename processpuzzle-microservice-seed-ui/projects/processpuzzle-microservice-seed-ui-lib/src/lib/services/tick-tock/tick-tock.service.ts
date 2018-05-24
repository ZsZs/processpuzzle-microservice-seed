import { Injectable } from '@angular/core';
import { Observable, timer } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({ providedIn: 'root' })
export class TickTockService {
  private readonly TIMEOUT: number = 1000;

  private static formatTimeNumber(value: number): string {
    const stringValue = value.toString();
    return ('0' + stringValue).slice(-2);
  }

  private static getNowString(): string {
    const date = new Date();

    const hours = TickTockService.formatTimeNumber(date.getHours());
    const minutes = TickTockService.formatTimeNumber(date.getMinutes());
    const seconds = TickTockService.formatTimeNumber(date.getSeconds());

    return `${hours}:${minutes}:${seconds}`;
  }


  public getTick(): Observable<string> {
    return timer( 0, this.TIMEOUT ).pipe(
       map(( tick ) => TickTockService.getNowString())
    );
  }

}
