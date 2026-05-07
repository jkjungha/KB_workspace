/* <첫 모듈 정의> */
// let base = 100;
// const add = (x) => base + x;
// const multiply = (x) => base * x;
// export { add, multiply };

/* <직접 export하여 위와 동일한 모듈> */
// let base = 100;
// export const add = (x) => base + x;
// export const multiply = (x) => base * x;

/* <base export포함한 모듈 정의> */
let base = 100;
const add = (x) => base + x;
const multiply = (x) => base * x;
const getBase = () => base;
export { add, multiply };
export default getBase;
