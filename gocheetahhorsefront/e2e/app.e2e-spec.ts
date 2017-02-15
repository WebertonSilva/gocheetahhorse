import { GocheetahhorsefrontPage } from './app.po';

describe('gocheetahhorsefront App', function() {
  let page: GocheetahhorsefrontPage;

  beforeEach(() => {
    page = new GocheetahhorsefrontPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
