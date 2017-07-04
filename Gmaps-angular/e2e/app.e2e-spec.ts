import { VignanMapsProjectPage } from './app.po';

describe('vignan-maps-project App', () => {
  let page: VignanMapsProjectPage;

  beforeEach(() => {
    page = new VignanMapsProjectPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
