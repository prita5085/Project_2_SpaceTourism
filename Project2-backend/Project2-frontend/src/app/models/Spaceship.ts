
export class Spaceship {

    ss_id: number;
    typeOfSpaceship: string;
    ssName: string;
    numSeats: number;

    constructor(ss_id: number, typeOfSpaceship: string = "", ssName: string = "", numSeats: number) {

        this.ss_id = ss_id;
        this.typeOfSpaceship = typeOfSpaceship;
        this.ssName = ssName;
        this.numSeats = numSeats;

    }

}