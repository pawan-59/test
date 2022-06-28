import http from 'k6/http';
import { sleep } from 'k6';
export let options = {
  vus: 12,
  duration: '31s',
};
export default function () {
  http.get('http://test.k6.io');
  sleep(12);
}
