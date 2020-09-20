export type GamePlatform = 'XBOX' | 'PC' | 'PLAYSTATION';

export type Game = {
  id: number;
  name: string;
  platform: GamePlatform;
  label: string;
  value: number;
}