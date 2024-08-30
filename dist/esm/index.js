import { registerPlugin } from '@capacitor/core';
const RootJailBreakDetector = registerPlugin('RootJailBreakDetector', {
    web: () => import('./web').then(m => new m.RootJailBreakDetectorWeb()),
});
export * from './definitions';
export { RootJailBreakDetector };
//# sourceMappingURL=index.js.map