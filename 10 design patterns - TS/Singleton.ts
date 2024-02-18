class Settings {
  static instance: Settings;
  public readonly mode = "dark";

  //new keyword wont work because constructor is private
  private constructor() {}

  static getInstance(): Settings {
    if (!Settings.instance) {
      Settings.instance = new Settings();
    }
    return Settings.instance;
  }
}

// const settings = new Settings(); - wont work
const settings = Settings.getInstance();

// JS WAY - global object has same behavior
const settingsObj = {
    dark : "true"
}