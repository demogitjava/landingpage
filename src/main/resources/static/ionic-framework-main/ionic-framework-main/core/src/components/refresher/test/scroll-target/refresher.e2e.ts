import { expect } from '@playwright/test';
import { test } from '@utils/test/playwright';

import { pullToRefresh } from '../test.utils';

// TODO: Enable this test when touch events/gestures are better supported in Playwright: https://github.com/microsoft/playwright/issues/2903
test.skip('refresher: custom scroll target', () => {
  test.beforeEach(async ({ page }) => {
    await page.goto('/src/components/refresher/test/scroll-target');
  });

  test.describe('legacy refresher', () => {
    test('should load more items when performing a pull-to-refresh', async ({ page }) => {
      const items = page.locator('ion-item');

      expect(await items.count()).toBe(30);

      await pullToRefresh(page, '#inner-scroll');

      expect(await items.count()).toBe(60);
    });
  });

  test.describe('native refresher', () => {
    test('should load more items when performing a pull-to-refresh', async ({ page }) => {
      const refresherContent = page.locator('ion-refresher-content');
      refresherContent.evaluateHandle((el: any) => {
        // Resets the pullingIcon to enable the native refresher
        el.pullingIcon = undefined;
      });

      await page.waitForChanges();

      const items = page.locator('ion-item');

      expect(await items.count()).toBe(30);

      await pullToRefresh(page, '#inner-scroll');

      expect(await items.count()).toBe(60);
    });
  });
});