import { registerPlugin } from '@capacitor/core';

import type { RootJailBreakDetectorPlugin } from './definitions';

const RootJailBreakDetector = registerPlugin<RootJailBreakDetectorPlugin>('RootJailBreakDetector', {
  web: () => import('./web').then(m => new m.RootJailBreakDetectorWeb()),
});

export * from './definitions';
export { RootJailBreakDetector };
