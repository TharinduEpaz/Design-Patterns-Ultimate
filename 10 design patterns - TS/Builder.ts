// https://youtu.be/tv-_1er1mWI

class HotDog {
  constructor(
    public bread: string,
    public ketchup?: boolean,
    public mustard?: boolean,
    public kraut?: boolean
  ) {}

  addKetchup() {
    this.ketchup = true;
    return this;
  }
  addMustard() {
    this.mustard = true;
    return this;
  }
  addKraut() {
    this.kraut = true;
    return this;
  }
}

const myLunch = new HotDog("Gluten Free");

myLunch
    .addKetchup()
    .addMustard()
    .addKraut();

console.log(myLunch);
